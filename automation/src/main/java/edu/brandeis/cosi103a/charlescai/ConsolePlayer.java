package edu.brandeis.cosi103a.charlescai;

import java.util.Optional;
import java.util.Scanner;

import com.google.common.collect.ImmutableList;

import edu.brandeis.cosi.atg.api.GameObserver;
import edu.brandeis.cosi.atg.api.GameState;
import edu.brandeis.cosi.atg.api.Player;
import edu.brandeis.cosi.atg.api.decisions.Decision;

public class ConsolePlayer implements Player {
  private Scanner scanner;
  private String name;

  public ConsolePlayer(String name, Scanner scanner) {
    this.name = name;
    this.scanner = new Scanner(System.in);
  }

  public String getName() {
    return this.name;
  }

  @Override
  public Decision makeDecision(GameState state, ImmutableList<Decision> options) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'makeDecision'");
  }

  @Override
  public Optional<GameObserver> getObserver() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getObserver'");
  }

}
