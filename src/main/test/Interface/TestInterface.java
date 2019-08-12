//package Interface;
//
///**
// * <Description> <br>
// *
// * @author 付永杰<br>
// * @version 1.0<br>
// * @taskId <br>
// * @CreateDate 2019年05月04日 <br>
// * @see Interface <br>
// * @since V1.0 <br>
// */
//public class TestInterface {
//
//    public static void main(String[] args) {
//        Computer computer = new Computer();
//        IMobileStorage mp3Player = new MP3Player();
//        IMobileStorage flashDisk = new FlashDisk();
//        IMobileStorage mobileHardDisk = new MobileHardDisk();
//        IMobileStorage newMobileStorage = new NewMobileStorage();
//        SuperStorageAdapter superStorageAdapter = new SuperStorageAdapter();
//        SuperStorage superStorage = new SuperStorage();
//        superStorageAdapter.setSuperStorage(superStorage);
//
//        System.out.println("I inserted my MP3 Player into my computer and copy some music to it:");
//        computer.setIMobileStorage(mp3Player);
//        computer.writeData();
//        System.out.println("====================");
//
//        System.out.println("Well,I also want to copy a great movie to my computer from a mobile hard disk:");
//        computer.setIMobileStorage(mobileHardDisk);
//        computer.readData();
//        System.out.println("====================");
//
//        System.out.println("OK!I have to read some files from my flash disk and copy another file to it:");
//        computer.setIMobileStorage(flashDisk);
//        computer.readData();
//        computer.writeData();
//        System.out.println();
//
//        computer.setIMobileStorage(newMobileStorage);
//        newMobileStorage.write();
//        newMobileStorage.read();
//        System.out.println();
//
//        System.out.println("Now,I am testing the new super storage with adapter:");
//        computer.setIMobileStorage(superStorageAdapter);
//        computer.readData();
//        computer.writeData();
//        System.out.println();
//
//    }
//}
