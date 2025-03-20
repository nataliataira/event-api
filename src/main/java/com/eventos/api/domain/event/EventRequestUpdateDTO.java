package com.eventos.api.domain.event;

public record EventRequestUpdateDTO(String title, String description, String imgUrl, String eventUrl, boolean remote, long date) {
}
