package com.bhuvnesh.requestValidationAndExceptionHandling.Exceptions;

public class UserNotFoundException extends Exception
{
    public UserNotFoundException(String message)
    {
        super(message);
    }
}
