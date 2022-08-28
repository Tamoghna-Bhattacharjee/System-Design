package Structural_Design_Pattern.Composite_DesignPattern.Leaf;

import Structural_Design_Pattern.Composite_DesignPattern.Component.File;

public class BinaryFile extends File {
    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("leaf node doesn't support add operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("leaf node doesn't support get operation");
    }

    @Override
    public void removeFile(File file) {
        throw new UnsupportedOperationException("leaf node doesn't support remove operation");
    }
}
