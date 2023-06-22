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
    public fun getJackbox2CoreGamePickerData(
    @RequestPart(value = "GamePicker")
    @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile): String {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.gamePickerData
    }

    @PostMapping("/GamePicker/image/settings/get",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    public fun getJackbox2CoreGamePickerImageSettings(
        @RequestPart(value = "GamePicker")
        @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile): ByteArray {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.gamePickerImageSettings
    }

    @PostMapping("/GamePicker/image/instructions/get",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    public fun getJackbox2CoreGamePickerImageInstructions(
        @RequestPart(value = "GamePicker")
        @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile): ByteArray {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.gamePickerImageInstructions
    }

    @PostMapping("/GamePicker/image/instructions2/get",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    public fun getJackbox2CoreGamePickerImageInstructions2(
        @RequestPart(value = "GamePicker")
        @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile): ByteArray {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.gamePickerImageInstructions2
    }

    @PostMapping("/GamePicker/post", consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    fun postJackbox2CoreGamePickerData(@RequestPart(value = "GamePicker")
                             @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile,
                                @RequestParam json : String,
                             ): ByteArray{
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.modifyGamePickerData(json)
    }

    @PostMapping("/GamePicker/settings/post", consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    fun postJackbox2CoreGamePickerImageSettings(@RequestPart(value = "GamePicker")
                             @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile,
                             @RequestPart(value = "image")
                             @Schema(type = "string", format = "binary") image: MultipartFile,
    ): ByteArray{
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.modifyGamePickerImageSettings(image.bytes)
    }

    @PostMapping("/GamePicker/instructions/post", consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    fun postJackbox2CoreGamePickerImageInstructions(@RequestPart(value = "GamePicker")
                             @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile,
                             @RequestPart(value = "image")
                             @Schema(type = "string", format = "binary") image: MultipartFile,
    ): ByteArray{
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.modifyGamePickerImageInstructions(image.bytes)
    }

    @PostMapping("/GamePicker/instructions2/post", consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    fun postJackbox2CoreGamePickerImageInstructions2(@RequestPart(value = "GamePicker")
                             @Schema(type = "string", format = "binary") fileGamePicker: MultipartFile,
                             @RequestPart(value = "image")
                             @Schema(type = "string", format = "binary") image: MultipartFile,
    ): ByteArray{
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfGamePicker(fileGamePicker.inputStream)
        return jb2ce.modifyGamePickerImageInstructions2(image.bytes)
    }


    // PauseDialog.swf

    @PostMapping("/PauseDialog/get",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    public fun getJackbox2CorePauseDialogData(
        @RequestPart(value = "PauseDialog")
        @Schema(type = "string", format = "binary") filePauseDialog: MultipartFile): String {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfPauseDialog(filePauseDialog.inputStream)
        return jb2ce.pauseDialogData
    }

    @PostMapping("/PauseDialog/post", consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    fun postJackbox2CorePauseDialogData(@RequestPart(value = "PauseDialog")
                             @Schema(type = "string", format = "binary") filePauseDialog: MultipartFile,
                             @RequestParam json : String,
    ): ByteArray{
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setSwfPauseDialog(filePauseDialog.inputStream)
        return jb2ce.modifyPauseDialogData(json)
    }

    @PostMapping("/content/get",consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    public fun getJackbox2CoreContentData(
        @RequestPart(value = "content")
        @Schema(type = "string", format = "binary") fileContent: MultipartFile): String {
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setJsonContent(fileContent.inputStream)
        return jb2ce.contentData
    }

    @PostMapping("/content/post", consumes= arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    fun postJackbox2CoreContentData(@RequestPart(value = "content")
                                        @Schema(type = "string", format = "binary") fileContent: MultipartFile,
                                        @RequestParam json : String,
    ): ByteArray{
        val jb2ce = Jackbox2CoreEditor()
        jb2ce.setJsonContent(fileContent.inputStream)
        return jb2ce.modifyContentData(json)
    }

}