package com.final_project.grammar_manager.model;

@NoArgsConstructor
@AllArgsConstructor
public class Derivation {
    private terminalReplaced String;
    private Production productionUsed;
    private String initialLetter;
    private String finalLetter;

}
