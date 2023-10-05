package EmplyeeHW09.example.Staffbook.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ImpossibleDepartmentID extends RuntimeException {
    public ImpossibleDepartmentID(String message) {
        super(message);
    }
}