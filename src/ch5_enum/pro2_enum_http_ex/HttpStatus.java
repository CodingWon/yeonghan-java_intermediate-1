package ch5_enum.pro2_enum_http_ex;

public enum HttpStatus {
    OK(200,"OK"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode (int code){
        HttpStatus[] httpStatuses = HttpStatus.values();
        for(HttpStatus httpStatu : httpStatuses){
            if(code == httpStatu.getCode()){
                return httpStatu;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess(){
        return 200 <= code && code <= 299;
    }
}
