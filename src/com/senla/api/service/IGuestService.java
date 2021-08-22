package com.senla.api.service;

import com.senla.model.Guest;

import java.time.Instant;

public interface IGuestService {

    Guest addGuest(Long id, String name, Integer age);
}
