package com.final_project.grammar_manager.model;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
public class Grammar {
    private ArrayList<Char> terminals;
    private ArrayList<Char> noTerminals;
    private char initialAxiom;
    private ArrayList<Production> productions;

    public void addTerminal(Char terminal) {
        terminals.add(terminal);
    }
    public void addNoTerminal(Char noTerminal) {
        noTerminals.add(noTerminal);
    }
    public void addProduction(Production production) {
        productions.add(production);
    }
}
