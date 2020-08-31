package dk.toldst.dms.integrationmanifestconsume.common;

public class ExceptionHelper {

    public static Throwable getExceptionCause(final Throwable throwable) {
        Throwable rootCause = throwable;
        while (rootCause.getCause() != null && rootCause.getCause() != rootCause) {
            rootCause = rootCause.getCause();
        }
        return rootCause;
    }
}
