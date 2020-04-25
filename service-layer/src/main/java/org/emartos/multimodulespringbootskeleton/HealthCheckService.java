package org.emartos.multimodulespringbootskeleton;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public String getHealthCheckStatus() {
        return "Ok!-v2";
    }
}
