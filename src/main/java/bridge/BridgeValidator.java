package bridge;

public class BridgeValidator {

    public void validateBridgeSize(String size) {
        String expression = "^[3-9]{1}$|^1{1}[0-9]{1}$|^2{1}0{1}$";
        if (!size.matches(expression)) {
            throw new IllegalArgumentException("[ERROR] 3~20사이의 숫자만 입력 가능합니다.");
        }
    }

    public void validateMovingDirection(String direction) {
        if (!direction.equals("U") && !direction.equals("D")) {
            throw new IllegalArgumentException("[ERROR] U혹은 D만 입력 가능합니다.");
        }
    }

    public void validateGameCommand(String gameCommand) {
        if (!gameCommand.equals("R") && !gameCommand.equals("Q")) {
            throw new IllegalArgumentException("[ERROR] R 혹은 Q만 입력 가능합니다.");
        }
    }
}
