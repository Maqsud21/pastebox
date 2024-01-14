package ru.sendel.pastebox.service;

import ru.sendel.pastebox.api.request.PasteBoxRequest;
import ru.sendel.pastebox.api.response.PasteBoxResponse;
import ru.sendel.pastebox.api.response.PasteBoxURLResponse;

import java.util.List;

public class PasteBoxServiceImpl implements PasteBoxService{
    @Override
    public PasteBoxResponse getByHash(String hash) {
        return null;
    }

    @Override
    public List<PasteBoxResponse> getFirstPublicPasteboxes(int amount) {
        return null;
    }

    @Override
    public PasteBoxURLResponse create(PasteBoxRequest pasteBoxRequest) {
        return null;
    }
}
