package com.senla.api.service;

import com.senla.model.Guest;

import java.time.Instant;

public interface IGuestService {

    Guest addGuest(String name, Integer age);
}
