package ru.sendel.pastebox.service;

import org.springframework.stereotype.Service;
import ru.sendel.pastebox.api.request.PasteBoxRequest;
import ru.sendel.pastebox.api.response.PasteBoxResponse;
import ru.sendel.pastebox.api.response.PasteBoxURLResponse;

import java.util.List;

@Service
public interface PasteBoxService {

    PasteBoxResponse getByHash(String hash);
    List<PasteBoxResponse> getFirstPublicPasteboxes(int amount);
    PasteBoxURLResponse create(PasteBoxRequest pasteBoxRequest);
}
