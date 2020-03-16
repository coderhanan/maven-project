package com.nttdata.maven.Parent_Child_Objects;

public class App 
{
    public static void main( String[] args )
    {
        ParentClass myPC = new ParentClass();
        myPC.parent();
        myPC.parentChild();
        
        ChildClass myCC = new ChildClass();
        myCC.child();
        myCC.childParent();
        
        
        
    }
}
