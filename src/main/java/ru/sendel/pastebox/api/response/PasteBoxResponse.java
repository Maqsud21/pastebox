package ru.sendel.pastebox.api.response;

import lombok.Data;
import ru.sendel.pastebox.api.request.PublicStatus;
@Data
public class PasteBoxResponse {

    private String data;
    private PublicStatus status;
}
