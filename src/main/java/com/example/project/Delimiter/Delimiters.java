package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delim= new ArrayList<>();
        for(int i=0; i<tokens.length;i++){
            if(tokens[i].equals("(")||tokens[i].equals(")")){
                delim.add(tokens[i]);
            }
            if(tokens[i].length()>=3){
            if(tokens[i].substring(0,1).equals("<")){
                if(tokens[i].substring(tokens[i].length()-1,tokens[i].length()).equals(">")){
                    delim.add(tokens[i]);
                }
            }
        }
    }
        return delim;
    }
    

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        int open=0;
        int close=0;
        for(int i=0; i<delimiters.size();i++){
            if(delimiters.get(i).equals("(")){
                open++;
            }
            else{
                if(delimiters.get(i).equals(")")){
                    close++;
                }
            
            else{
                if(delimiters.get(i).substring(0,2).equals("</")){
                    if(delimiters.get(i).substring(delimiters.get(i).length()-1,delimiters.get(i).length()).equals(">")){
                        close++;
                    }
                }
                else{
                    if(delimiters.get(i).substring(0,1).equals("<")&&!delimiters.get(i).substring(1,2).equals("/")){
                            if(delimiters.get(i).substring(delimiters.get(i).length()-1,delimiters.get(i).length()).equals(">")){
                                open++;
                            }
                }

            
            }
            if(close>open){
                return false;
            }
        }}}
        if(close==open){
            return true;
        }
        return false;
    
}}