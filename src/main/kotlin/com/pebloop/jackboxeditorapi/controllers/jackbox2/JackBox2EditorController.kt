package com.pebloop.jackboxeditorapi.controllers.jackbox2

import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.tags.Tag
import jackbox.editor.core.JackBoxEditor
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile


@RestController()
@Tag(name = "Jackbox 2", description = "Jackbox 2 games")
@RequestMapping("/jackbox2/core")
class Jackbox2EditorController {

    @PostMapping("/getData",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    public fun GetJackbox2CoreData(
    @RequestPart(value = "JBPP2Picker")
    @Schema(type = "string", format = "binary") fileJBPP2Picker: MultipartFile): String {
        JackBoxEditor.getGameEditor(fileJBPP2Picker.inputStream)
        return "test"
    }

    @PostMapping("/")
    fun postJackbox2CoreData(@RequestParam files: MultipartFile,
                                @RequestParam gameName: String,
                             ): String {
        //JackBoxEditor.getGameEditor(path)
        return "test"
    }
}