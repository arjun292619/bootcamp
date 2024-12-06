package com.javaBootCamp.streams_section26;

import java.util.List;

public record Person(String name, String email, List<String> phoneNumbers, double income) {
}
