package kr.springboot.gg.study.qrcode.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("/api/qrcode")
public class QrCodeController {

    @GetMapping
    public ResponseEntity<?> createQrCode(@RequestParam String url) throws WriterException, IOException {

        int width = 200;
        int height = 200;
        BitMatrix matrix = new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, width, height);

        try (ByteArrayOutputStream output = new ByteArrayOutputStream();) {
            MatrixToImageWriter.writeToStream(matrix, "PNG", output);
            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_PNG)
                    .body(output.toByteArray());
        }

    }

}
