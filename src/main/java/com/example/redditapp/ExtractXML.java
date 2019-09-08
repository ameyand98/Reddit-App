package com.example.redditapp;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ExtractXML {

    private static final String TAG = "ExtractXML";

    private String tag;
    private String endtag;
    private String xml;

    public ExtractXML(String xml, String tag) {
        this.tag = tag;
        this.xml = xml;
        this.endtag = "NONE";
    }

    public ExtractXML(String xml, String tag, String endtag) {
        this.tag = tag;
        this.xml = xml;
        this.endtag = endtag;
    }

    public List<String> start(){
        List<String> result = new ArrayList<>();
        String[] splitXML = null;
        String marker = null;


        if(endtag.equals("NONE")){
            marker = "\"";
            splitXML = xml.split(tag + marker);
        }
        else{
            marker = endtag;
            splitXML = xml.split(tag);
        }

        int count = splitXML.length;

        for( int i = 1; i < count; i++){
            String temp = splitXML[i];
            int index = temp.indexOf(marker);
          
            temp = temp.substring(0,index);
            result.add(temp);
        }

        return result;
    }
