package com.example;

public class XmltoPojo
{
    private Note note;

    public Note getNote ()
    {
        return note;
    }

    public void setNote (Note note)
    {
        this.note = note;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [note = "+note+"]";
    }
}
			