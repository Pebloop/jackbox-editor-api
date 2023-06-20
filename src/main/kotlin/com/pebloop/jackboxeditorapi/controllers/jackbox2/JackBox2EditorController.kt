package com.pebloop.jackboxeditorapi.controllers.jackbox2

import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.tags.Tag
import jackbox.editor.core.editors.jackbox2.core.Jackbox2CoreEditor
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile


@RestController()
@Tag(name = "Jackbox 2", description = "Jackbox 2 games")
@RequestMapping("/jackbox2/core")
class Jackbox2EditorController {

    @PostMapping("/GamePicker/get",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    public fun getJackbox2CoreData(
    @RequestPart(value = "GamePicker")
    @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile): String {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.gamePickerData
    }

    @PostMapping("/GamePicker/image/settings/get",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    public fun getJackbox2CoreImageSettings(
        @RequestPart(value = "GamePicker")
        @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile): ByteArray {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.gamePickerImageSettings
    }

    @PostMapping("/GamePicker/image/instructions/get",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    public fun getJackbox2CoreImageInstructions(
        @RequestPart(value = "GamePicker")
        @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile): ByteArray {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.gamePickerImageInstructions
    }

    @PostMapping("/GamePicker/image/instructions2/get",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    public fun getJackbox2CoreImageInstructions2(
        @RequestPart(value = "GamePicker")
        @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile): ByteArray {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.gamePickerImageInstructions2
    }

    @PostMapping("/GamePicker/post", consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    fun postJackbox2CoreData(@RequestPart(value = "GamePicker")
                             @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile,
                                @RequestParam json : String,
                             ): ByteArray{
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.modifyGamePickerData(json)
    }


}