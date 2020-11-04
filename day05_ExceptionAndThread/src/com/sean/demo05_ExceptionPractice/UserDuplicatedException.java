package com.sean.demo05_ExceptionPractice;

public class UserDuplicatedException extends RuntimeException {

    public UserDuplicatedException() {
    }

    public UserDuplicatedException(String message) {
        super(message);
    }
}
