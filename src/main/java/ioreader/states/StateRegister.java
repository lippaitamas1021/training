package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public List<State> getStates() {
        return states;
    }

    public void readStatesFromFile(String fileName) {
        Path path = Path.of(fileName);
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split("-");
                String stateName = temp[0];
                String capital = temp[1];
                states.add(new State(stateName, capital));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public String findCapitalByStateName(String stateName) {
        for (State state : states) {
            if (stateName.equals(state.getStateName())) {
                return state.getCapital();
            }
        }
        throw new IllegalArgumentException("No state with this name!");
    }
}
