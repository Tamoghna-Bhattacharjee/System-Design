package Structural_Design_Pattern.Composite_DesignPattern.Component;

import java.util.Objects;

public abstract class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void ls();
    public abstract void addFile(File file);
    public abstract File[] getFiles();
    public abstract void removeFile(File file);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File file)) return false;
        return getName().equals(file.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
