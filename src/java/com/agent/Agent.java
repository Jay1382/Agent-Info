package com.agent;

public class Agent {

    private int ID;
    private String AGENTNAME;
    private int CODE;
    private int SYMBOL;

    public Agent(int ID, String AGENTNAME, int CODE, int SYMBOL) {
        this.ID = ID;
        this.AGENTNAME = AGENTNAME;
        this.CODE = CODE;
        this.SYMBOL = SYMBOL;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAGENTNAME() {
        return AGENTNAME;
    }

    public void setAGENTNAME(String AGENTNAME) {
        this.AGENTNAME = AGENTNAME;
    }

    public int getCODE() {
        return CODE;
    }

    public void setCODE(int CODE) {
        this.CODE = CODE;
    }

    public int getSYMBOL() {
        return SYMBOL;
    }

    public void setSYMBOL(int SYMBOL) {
        this.SYMBOL = SYMBOL;
    }

}
