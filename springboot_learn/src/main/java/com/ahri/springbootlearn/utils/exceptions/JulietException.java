package com.ahri.springbootlearn.utils.exceptions;

public class JulietException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public JulietException() {
        super();
    }

    public JulietException(String message) {
        super(message);
    }

    public JulietException(String message, Throwable cause) {
        super(message, cause);
    }

    public JulietException(Throwable cause) {
        super(cause);
    }
}
