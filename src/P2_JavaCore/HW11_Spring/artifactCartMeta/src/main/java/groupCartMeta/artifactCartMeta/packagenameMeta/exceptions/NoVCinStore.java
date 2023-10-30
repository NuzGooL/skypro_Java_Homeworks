package groupCartMeta.artifactCartMeta.packagenameMeta.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class NoVCinStore extends RuntimeException {
    public NoVCinStore(String message) {
        super(message);
    }
}