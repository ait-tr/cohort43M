package code.generics.practice.tasks;

class GenericCalculatorVar2<T extends Number> implements CalculatorOperations<T> {

    @Override
    public T add(T a, T b) {
        return performOperation(a, b, Operation.ADD);
    }

    @Override
    public T subtract(T a, T b) {
        return performOperation(a, b, Operation.SUBTRACT);
    }

    @Override
    public T multiply(T a, T b) {
        return performOperation(a, b, Operation.MULTIPLY);
    }

    @Override
    public T divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return performOperation(a, b, Operation.DIVIDE);
    }

    private enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    @SuppressWarnings("unchecked")
    private T performOperation(T a, T b, Operation operation) {
        Double result = switch (operation) {
            case ADD -> a.doubleValue() + b.doubleValue();
            case SUBTRACT -> a.doubleValue() - b.doubleValue();
            case MULTIPLY -> a.doubleValue() * b.doubleValue();
            case DIVIDE -> a.doubleValue() / b.doubleValue();
        };

        if (a instanceof Integer) {
            return (T) Integer.valueOf(result.intValue());
        } else if (a instanceof Double) {
            return (T) result;
        } else if (a instanceof Float) {
            return (T) Float.valueOf(result.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(result.longValue());
        } else if (a instanceof Short) {
            return (T) Short.valueOf(result.shortValue());
        } else if (a instanceof Byte) {
            return (T) Byte.valueOf(result.byteValue());
        } else {
            throw new UnsupportedOperationException("Operation not supported for this type");
        }
    }
}
