package per.ym.springcloud.service.impl;

import org.springframework.stereotype.Service;
import per.ym.springcloud.dao.PaymentDao;
import per.ym.springcloud.entities.Payment;
import per.ym.springcloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
