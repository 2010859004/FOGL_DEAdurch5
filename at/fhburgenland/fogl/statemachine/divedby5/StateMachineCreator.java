package at.fhburgenland.fogl.statemachine.divedby5;

import at.fhburgenland.fogl.statemachine.StateMachine;

/**
 * Created with IntelliJ IDEA.
 * User: a.doetzl
 * Date: 19.05.2021
 * Time: 14:04
 */
public class StateMachineCreator {

  private StateMachineCreator() {
  }

  public static StateMachine createDivideBy5StateMachine(String input) {
    return new DivedBy5StateMachine(input);
  }
}
