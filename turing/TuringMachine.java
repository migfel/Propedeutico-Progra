import java.util.HashMap;
import java.util.Map;

public class TuringMachine {
    private Map<String, Transition> transitions;
    private String currentState;
    private StringBuilder tape;
    private int headPosition;

    public TuringMachine(String initialState, String input) {
        transitions = new HashMap<>();
        currentState = initialState;
        tape = new StringBuilder(input);
        headPosition = 0;
    }

    public void addTransition(String state, char readSymbol, String nextState,
                              char writeSymbol, char moveDirection) {
        Transition transition = new Transition(nextState, writeSymbol, moveDirection);
        transitions.put(state + readSymbol, transition);
    }

    public void run() {
        while (!currentState.equals("accept") && !currentState.equals("reject")) {
            char currentSymbol = getCurrentSymbol();
            Transition transition = transitions.get(currentState + currentSymbol);
            if (transition == null) {
                currentState = "reject";
                break;
            }
            updateStateAndSymbol(transition);
            moveHead(transition.getMoveDirection());
        }
        System.out.println("Final State: " + currentState);
        System.out.println("Tape: " + tape.toString());
    }

    private char getCurrentSymbol() {
        if (headPosition >= 0 && headPosition < tape.length()) {
            return tape.charAt(headPosition);
        } else {
            return ' ';
        }
    }

    private void updateStateAndSymbol(Transition transition) {
        currentState = transition.getNextState();
        tape.setCharAt(headPosition, transition.getWriteSymbol());
    }

    private void moveHead(char moveDirection) {
        if (moveDirection == 'L') {
            headPosition--;
        } else if (moveDirection == 'R') {
            headPosition++;
            if (headPosition == tape.length()) {
                tape.append(' ');
            }
        }
    }

    private static class Transition {
        private String nextState;
        private char writeSymbol;
        private char moveDirection;

        public Transition(String nextState, char writeSymbol, char moveDirection) {
            this.nextState = nextState;
            this.writeSymbol = writeSymbol;
            this.moveDirection = moveDirection;
        }

        public String getNextState() {
            return nextState;
        }

        public char getWriteSymbol() {
            return writeSymbol;
        }

        public char getMoveDirection() {
            return moveDirection;
        }
    }

    public static void main(String[] args) {
        TuringMachine tm = new TuringMachine("q0", "101");

        tm.addTransition("q0", '0', "q1", '1', 'R');
        tm.addTransition("q0", '1', "q0", '0', 'L');
        tm.addTransition("q1", '0', "q1", '0', 'R');
        tm.addTransition("q1", '1', "q1", '1', 'R');
        tm.addTransition("q1", ' ', "accept", ' ', 'L');

        tm.run();
    }
}
