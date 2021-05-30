package com.sophon.inversion;

public class InversionImplementation {
    public static void main(String[] args) {
        MiTv miTv = new MiTv();
        // implementation 1
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(miTv);
        // implementation 2
//        OpenAndClose openAndClose = new OpenAndClose(miTv);
//        openAndClose.open();
        // implementation 3
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(miTv);
        openAndClose.open();
    }
}

interface ITV {
    public void play();
}

class MiTv implements ITV {
    public void play() {
        System.out.println("Open MiTV.");
    }
}

// implementation 1: Interface
//interface IOpenAndClose {
//    public void open(ITV tv);
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

// implementation 2: Constructor
//interface IOpenAndClose {
//    public void open();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    private ITV tv;
//    public OpenAndClose (MiTv tv) {
//        this.tv = tv;
//    }
//
//    public void open() {
//        this.tv.play();
//    }
//}

// implementation 3
interface IOpenAndClose {
    public void open();
    public void setTv(ITV tv);
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;
    public void setTv(ITV tv) {
        this.tv = tv;
    }
    public void open() {
        this.tv.play();
    }
}

