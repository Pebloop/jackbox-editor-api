package com.pebloop.jackboxeditorapi.controllers.jackbox2

import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.tags.Tag
import jackbox.editor.core.jackbox2.core.Jackbox2CoreEditor
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile


@RestController()
@Tag(name = "Jackbox 2", description = "Jackbox 2 games")
@RequestMapping("/jackbox2/core")
class Jackbox2EditorController {

    @PostMapping("/getData",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    public fun getJackbox2CoreData(
    @RequestPart(value = "GamePicker")
    @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile): String {
        val jb2ce = Jackbox2CoreEditor(fileGamePicker.inputStream)
        return jb2ce.data
    }

    @PostMapping("/applyModifications", consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    fun postJackbox2CoreData(@RequestPart(value = "GamePicker")
                             @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile,
                                @RequestParam json : String,
                             ): ByteArray{
        val jb2ce = Jackbox2CoreEditor(fileGamePicker.inputStream)
        return jb2ce.modifyData(json)
    }
}