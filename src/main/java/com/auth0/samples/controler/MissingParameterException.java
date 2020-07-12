package com.auth0.samples.controler;

public class MissingParameterException extends RuntimeException
{
    public MissingParameterException(String message)
    {
        super(message);
    }
}
