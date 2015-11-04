package dk.cngroup.team;

import dk.cngroup.team.skill.Testing;

public class JavaDeveloper implements Testing {

  @Override
  public boolean unitTesting() {
    return true;
  }

  @Override
  public boolean integrationTesting() {
    return true;
  }

  @Override
  public boolean end2endTesting() {
    return true;
  }

}
