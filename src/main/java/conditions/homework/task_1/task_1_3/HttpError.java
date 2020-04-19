package conditions.homework.task_1.task_1_3;

public enum HttpError {
    INFORMATIONAL, SUCCESS, REDIRECTION, CLIENT_ERRORS, SERVER_ERRORS;
    static HttpError httpError;
    public static HttpError getError(String code){
        switch (code.substring(0, 1)){
            case "1" : httpError = HttpError.INFORMATIONAL; break;
            case "2" : httpError = HttpError.SUCCESS; break;
            case "3" : httpError = HttpError.REDIRECTION; break;
            case "4" : httpError = HttpError.CLIENT_ERRORS; break;
            case "5" : httpError = HttpError.SERVER_ERRORS; break;
            default:
                System.out.println("No such code");
                System.exit(0);
        }
        return httpError;
    }
}
