package com.final_project.grammar_manager.model;


@NpArgsConstructor
@AllArgsConstructor
public class GrammarManager {
    private Grammar grammar;
    private ArrayList<Derivation> derivations;

    public boolean isSecondGrade(){
        return false;
    }
    public boolean isThirdGrade(){
        return false;
    }
    public boolean validateWord(String word){
        return false;
    }
    public ArrayList<String> generateWords(int charactersQuantity){
        return null;
    }
}
