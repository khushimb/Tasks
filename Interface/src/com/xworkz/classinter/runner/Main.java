package com.xworkz.classinter.runner;

import com.xworkz.classinter.internal.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Library();
        book.close();
        book.open();
        book.read();
        System.out.println("=====================================");
        Circle circle = new Circle();
        Shape shape = new Circle();
        shape.edit();
        shape.draw();
        shape.write();
        System.out.println("=====================================");
        Animal animal = new Dog();
        Dog dog = new Dog();
        dog.eat();
        dog.drink();
        dog.sleep();
        System.out.println("=====================================");
        Vehicle vehicle = new Car();
        Car car = new Car();
        car.ride();
        car.drive();
        car.park();
        System.out.println("=====================================");
        Database database = new Sql();
        Sql sql = new Sql();
        sql.method1();
        sql.method2();
        sql.method3();
        System.out.println("=====================================");
        Logger logger = new FileLogger();
        FileLogger fileLogger = new FileLogger();
        fileLogger.method1();
        fileLogger.method2();
        fileLogger.method3();
        System.out.println("=====================================");
        UserService userService = new User();
        User user = new User();
        user.method1();
        user.method2();
        user.method3();
        System.out.println("=====================================");
        Notification notification = new EmailNotification();
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.method1();
        emailNotification.method2();
        emailNotification.method3();
        System.out.println("=====================================");
        Payment payment = new PhonePe();
        PhonePe phonePe = new PhonePe();
        phonePe.method1();
        phonePe.method2();
        phonePe.method3();
        System.out.println("=====================================");
        JwtAuthenticator jwtAuthenticator = new Authenticator();
        Authenticator authenticator = new Authenticator();
        authenticator.method1();
        authenticator.method2();
        authenticator.method3();
        System.out.println("=====================================");
        Reader reader = new FileReader();
        FileReader fileReader = new FileReader();
        fileReader.method1();
        fileReader.method2();
        fileReader.method3();
        System.out.println("=====================================");
        Writer writer = new FileWriter();
        FileWriter fileWriter = new FileWriter();
        fileWriter.method1();
        fileWriter.method2();
        fileWriter.method3();
        System.out.println("=====================================");
        Connection connection = new TcpConnection();
        TcpConnection tcpConnection = new TcpConnection();
        tcpConnection.method1();
        tcpConnection.method2();
        tcpConnection.method3();
        System.out.println("=====================================");
        Cache cache = new MemoryCache();
        MemoryCache memoryCache = new MemoryCache();
        memoryCache.method1();
        memoryCache.method2();
        memoryCache.method3();
        System.out.println("=====================================");
        Processor processor = new DataProcessor();
        DataProcessor dataProcessor = new DataProcessor();
        dataProcessor.method1();
        dataProcessor.method2();
        dataProcessor.method3();
        System.out.println("=====================================");
        Scheduler scheduler = new TaskScheduler();
        TaskScheduler taskScheduler = new TaskScheduler();
        taskScheduler.method1();
        taskScheduler.method2();
        taskScheduler.method3();
        System.out.println("=====================================");
        FileSystem fileSystem = new LinuxFileSystem();
        LinuxFileSystem linuxFileSystem = new LinuxFileSystem();
        linuxFileSystem.method1();
        linuxFileSystem.method2();
        linuxFileSystem.method3();
        System.out.println("=====================================");
        Transaction transaction = new BankTransaction();
        BankTransaction bankTransaction = new BankTransaction();
        bankTransaction.method1();
        bankTransaction.method2();
        bankTransaction.method3();
        System.out.println("=====================================");
        Parser parser = new JsonParser();
        JsonParser jsonParser = new JsonParser();
        jsonParser.method1();
        jsonParser.method2();
        jsonParser.method3();
        System.out.println("=====================================");
        Formatter formatter = new HtmlFormatter();
        HtmlFormatter htmlFormatter = new HtmlFormatter();
        htmlFormatter.method1();
        htmlFormatter.method2();
        htmlFormatter.method3();
        System.out.println("=====================================");
        Clock clock = new SystemClock();
        SystemClock systemClock = new SystemClock();
        systemClock.method1();
        systemClock.method2();
        systemClock.method3();
        System.out.println("=====================================");
        Compressor compressor = new ZipCompressor();
        ZipCompressor zipCompressor = new ZipCompressor();
        zipCompressor.method1();
        zipCompressor.method2();
        zipCompressor.method3();
        System.out.println("=====================================");
        Downloader downloader = new ImageDownloader();
        ImageDownloader imageDownloader = new ImageDownloader();
        imageDownloader.method1();
        imageDownloader.method2();
        imageDownloader.method3();
        System.out.println("=====================================");
        Filter filter = new SpamFilter();
        SpamFilter spamFilter = new SpamFilter();
        spamFilter.method1();
        spamFilter.method2();
        spamFilter.method3();
        System.out.println("=====================================");
        Sorter sorter = new QuickSorter();
        QuickSorter quickSorter = new QuickSorter();
        quickSorter.method1();
        quickSorter.method2();
        quickSorter.method3();
        System.out.println("=====================================");
        Search search = new BinarySearch();
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.method1();
        binarySearch.method2();
        binarySearch.method3();
        System.out.println("=====================================");
        Validator validator = new EmailValidator();
        EmailValidator emailValidator = new EmailValidator();
        emailValidator.method1();
        emailValidator.method2();
        emailValidator.method3();
        System.out.println("=====================================");
        Queue queue = new MessageQueue();
        MessageQueue messageQueue = new MessageQueue();
        messageQueue.method1();
        messageQueue.method2();
        messageQueue.method3();
        System.out.println("=====================================");
        TokenGenerator tokenGenerator = new UniTokenGenerator();
        UniTokenGenerator uniTokenGenerator = new UniTokenGenerator();
        uniTokenGenerator.method1();
        uniTokenGenerator.method2();
        uniTokenGenerator.method3();
        System.out.println("=====================================");
        Engine engine = new GasEngine();
        GasEngine gasEngine = new GasEngine();
        gasEngine.method1();
        gasEngine.method2();
        gasEngine.method3();
        System.out.println("=====================================");
        Game game = new ChessGame();
        ChessGame chessGame = new ChessGame();
        chessGame.method1();
        chessGame.method2();
        chessGame.method3();
        System.out.println("=====================================");
        Mouse mouse = new WiredMouse();
        WiredMouse wiredMouse = new WiredMouse();
        wiredMouse.method1();
        wiredMouse.method2();
        wiredMouse.method3();
        System.out.println("=====================================");
        Keyboard keyboard = new MechanicalKeyboard();
        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        mechanicalKeyboard.method1();
        mechanicalKeyboard.method2();
        mechanicalKeyboard.method3();
        System.out.println("=====================================");
        Camera camera = new SecurityCamera();
        SecurityCamera securityCamera = new SecurityCamera();
        securityCamera.method1();
        securityCamera.method2();
        securityCamera.method3();
        System.out.println("=====================================");
        Speaker speaker = new BluetoothSpeaker();
        BluetoothSpeaker bluetoothSpeaker = new BluetoothSpeaker();
        bluetoothSpeaker.method1();
        bluetoothSpeaker.method2();
        bluetoothSpeaker.method3();
        System.out.println("=====================================");
        Calculator calculator = new ScientificCalc();
        ScientificCalc scientificCalc = new ScientificCalc();
        scientificCalc.method1();
        scientificCalc.method2();
        scientificCalc.method3();
        System.out.println("=====================================");
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.method1();
        simpleCalculator.method2();
        simpleCalculator.method3();
        System.out.println("=====================================");
        ChatService chatService = new SlackChatService();
        SlackChatService slackChatService = new SlackChatService();
        slackChatService.method1();
        slackChatService.method2();
        slackChatService.method3();
        System.out.println("=====================================");
        Response response = new JsonResponse();
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.method1();
        jsonResponse.method2();
        jsonResponse.method3();
        System.out.println("=====================================");
        Request request = new HttpRequest();
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.method1();
        httpRequest.method2();
        httpRequest.method3();
        System.out.println("=====================================");
        Layout layout = new GridLayout();
        GridLayout gridLayout = new GridLayout();
        gridLayout.method1();
        gridLayout.method2();
        gridLayout.method3();
        System.out.println("=====================================");
        Renderer renderer = new LocalRenderer();
        LocalRenderer localRenderer = new LocalRenderer();
        localRenderer.method1();
        localRenderer.method2();
        localRenderer.method3();
        System.out.println("=====================================");
        Theme theme = new DarkTheme();
        DarkTheme darkTheme =  new DarkTheme();
        darkTheme.method1();
        darkTheme.method2();
        darkTheme.method3();
        System.out.println("=====================================");
        Driver driver = new PaintDriver();
        PaintDriver paintDriver = new PaintDriver();
        paintDriver.method1();
        paintDriver.method2();
        paintDriver.method3();
        System.out.println("=====================================");
        Permission permission = new AdminPermission();
        AdminPermission adminPermission = new AdminPermission();
        adminPermission.method1();
        adminPermission.method2();
        adminPermission.method3();
        System.out.println("=====================================");
        ReportGenerator reportGenerator = new PdfGenerator();
        PdfGenerator pdfGenerator = new PdfGenerator();
        pdfGenerator.method1();
        pdfGenerator.method2();
        pdfGenerator.method3();
        System.out.println("=====================================");
        Invoice invoice = new MontlyInvoice();
        MontlyInvoice montlyInvoice = new MontlyInvoice();
        montlyInvoice.method1();
        montlyInvoice.method2();
        montlyInvoice.method3();
        System.out.println("=====================================");
        Profile profile = new UserProfile();
        UserProfile userProfile = new UserProfile();
        userProfile.method1();
        userProfile.method2();
        userProfile.method3();
        System.out.println("=====================================");
        Account account = new SavingsAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.method1();
        savingsAccount.method2();
        savingsAccount.method3();
        System.out.println("=====================================");
        Plan plan = new SubscriptionPlan();
        SubscriptionPlan subscriptionPlan = new SubscriptionPlan();
        subscriptionPlan.method1();
        subscriptionPlan.method2();
        subscriptionPlan.method3();
        System.out.println("=====================================");
        Order order = new OnlineOrder();
        OnlineOrder onlineOrder = new OnlineOrder();
        onlineOrder.method1();
        onlineOrder.method2();
        onlineOrder.method3();
        System.out.println("=====================================");















    }
}
