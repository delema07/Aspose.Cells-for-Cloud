package AsposeCellsCloud::Object::DateTimeGroupItem;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use base "AsposeCellsCloud::Object::BaseObject";

#
#
#
#NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
#

my $swagger_types = {
    'DateTimeGroupingType' => 'string',
    'Day' => 'int',
    'Hour' => 'int',
    'Minute' => 'int',
    'Month' => 'int',
    'Second' => 'int',
    'Year' => 'int'
};

my $attribute_map = {
    'DateTimeGroupingType' => 'DateTimeGroupingType',
    'Day' => 'Day',
    'Hour' => 'Hour',
    'Minute' => 'Minute',
    'Month' => 'Month',
    'Second' => 'Second',
    'Year' => 'Year'
};

# new object
sub new { 
    my ($class, %args) = @_; 
    my $self = { 
        #
        'DateTimeGroupingType' => $args{'DateTimeGroupingType'}, 
        #
        'Day' => $args{'Day'}, 
        #
        'Hour' => $args{'Hour'}, 
        #
        'Minute' => $args{'Minute'}, 
        #
        'Month' => $args{'Month'}, 
        #
        'Second' => $args{'Second'}, 
        #
        'Year' => $args{'Year'}
    }; 

    return bless $self, $class; 
}  

# get swagger type of the attribute
sub get_swagger_types {
    return $swagger_types;
}

# get attribute mappping
sub get_attribute_map {
    return $attribute_map;
}

1;
