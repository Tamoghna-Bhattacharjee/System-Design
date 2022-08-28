package Structural_Design_Pattern.Composite_DesignPattern.Composite;

import Structural_Design_Pattern.Composite_DesignPattern.Component.File;

import java.util.LinkedList;
import java.util.List;

public class Directory extends File {

    private List<File> children = new LinkedList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(getName());
        for (File i: children) i.ls();
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }

    @Override
    public void removeFile(File file) {
        children.remove(file);
    }
}
