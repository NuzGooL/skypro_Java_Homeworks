package P2_JavaCore.HW05_Exeptions;

class WrongLoginException extends IllegalArgumentException {
    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends IllegalArgumentException {
    public WrongPasswordException(String message) {
        super(message);
    }
}