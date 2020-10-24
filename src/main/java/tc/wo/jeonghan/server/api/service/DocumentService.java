package tc.wo.jeonghan.server.api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import tc.wo.jeonghan.server.api.domain.Document;

@Service
public class DocumentService {

    @GetMapping("/document")
    public Document getDocument(int id) {
        Document document = new Document(id, "untitled", "blank text", null);
        return document;
    }
}
