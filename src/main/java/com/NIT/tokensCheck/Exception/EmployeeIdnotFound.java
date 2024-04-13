package com.NIT.tokensCheck.Exception;

import java.text.MessageFormat;

public class EmployeeIdnotFound extends RuntimeException{
    public EmployeeIdnotFound(int id)
    {
        super(MessageFormat.format("could not found employee id {0}",id));
    }

}
