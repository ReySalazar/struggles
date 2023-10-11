package com.descortes.struggle;

import com.descortes.struggle.config.StruggleAppInit;
import com.descortes.struggle.service.StruggleService;
import com.descortes.struggle.service.impl.StruggleServiceImpl;

public class StruggleApp {
    public static void main(String[] args)  {
        StruggleAppInit struggleAppInit = new StruggleAppInit();
        struggleAppInit.start();
    }
    public static String run(String estadio, String humano, String espada, String humano1, String espada1) {
        StruggleService struggleService = new StruggleServiceImpl();

        return struggleService.enfrentar(estadio,  humano, espada, humano1, espada1);
    }
}
