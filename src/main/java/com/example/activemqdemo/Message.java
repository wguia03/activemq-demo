package com.example.activemqdemo;

import java.io.Serializable;

public record Message(String text) implements Serializable {

}
