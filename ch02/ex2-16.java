import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.Math.sqrt;

public class ImpNumberClassifier {
    private int _number;
    private Map<Integer, Integer> _cache;

    public ImpNumberClassifier(int targetNumber) {
	_number = targetNumber;
	_cache = new HashMap<>();
    }

    private boolean isFactor(int candidate) {
	return _number % candidate == 0;
    }

    private Set<Integer> getFactors() {
	Set<Integer> factors = new HashSet<>();
	factors.add(1);
	factors.add(_number);
	for (int i = 2; i <= sqrt(_number); i++)
	    if (isFactor(i)) {
		factors.add(i);
		factors.add(_number / i);
	    }
	return factors;
    }

    private int aliquotSum() {
	int sum = 0;
	for (int i : getFactors())
	    sum += i;
	return sum - _number;
    }

    private int cachedAliquotSum() {
	if (_cache.containsKey(_number))
	    return _cache.get(_number);
	else {
	    int sum = aliquotSum();
	    _cache.put(_number, sum);
	    return sum;
	}
    }

    public boolean isPerfect() {
	return cachedAliotSum() == _number;
    }

    public boolean isAboundant() {
	return cachedAliquotSum() > _number;
    }

    public boolean isDeficient() {
	return cachedAliquotSum() < _number;
    }
}
