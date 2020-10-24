package tc.wo.jeonghan.server.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tc.wo.jeonghan.server.api.domain.Document;
import tc.wo.jeonghan.server.api.service.DocumentService;

@RestController
public class DocumentController {

    private DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/document")
    public Document getDocument(@RequestParam(defaultValue = "0") int id) {
        return documentService.getDocument(id);
    }
}
