package step2.enumTest;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        if (httpCodeInput >= 200 && httpCodeInput <= 299){
            return OK;
        }
        if (httpCodeInput == 400){
            return BAD_REQUEST;
        }
        if (httpCodeInput == 404){
            return NOT_FOUND;
        }
        if (httpCodeInput == 500){
            return INTERNAL_SERVER_ERROR;
        }
        return null;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
