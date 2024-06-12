package HW_43.task_5;

class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Error: A negative number was entered.");
    }
}
