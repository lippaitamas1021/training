package tringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String s) {
        if (("").equals(s)) {
            throw new IllegalArgumentException("Empty string!");
        }
        if (s == null) {
            throw new IllegalArgumentException("Empty string!");
        }
        String t = s.trim();
        return t.charAt(t.length() - 1);
    }

    public String changeExtensionToLowerCase(String s) {
        if (s.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        }
        if (s.length() < 3 || 5 < s.length()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        String v = s.substring(0, s.indexOf("."));
        String t = s.substring(s.indexOf("."));
        return v + t.toLowerCase();
    }

    public String findFileExtension(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        if (s.length() < 3 || s.isBlank()) {
            throw new IllegalArgumentException("Invalid file name!");
        }
       return s.substring(s.indexOf("."));
    }

    public boolean identifyFilesByExtension(String extension, String fileName) {
        if (fileName == null || fileName.length() < 3 || fileName.isBlank()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        if (extension == null || extension.isBlank()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        if (fileName.substring(fileName.indexOf(".")+1).equals(extension)) {
            return true;
        }
        return false;
    }

    public boolean compareFilesByName(String d, String s) {
        if (d == null || s == null) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        if (d.isBlank() || s.isBlank()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        return d.equalsIgnoreCase(s);
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (fileName == null || ("").equals(fileName) || fileName.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        }
        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }
        return fileName;
    }
}
