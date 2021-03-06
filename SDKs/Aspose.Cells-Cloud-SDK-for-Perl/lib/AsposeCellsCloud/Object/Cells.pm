package AsposeCellsCloud::Object::Cells;

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
    'MaxRow' => 'int',
    'MaxColumn' => 'int',
    'CellCount' => 'int',
    'Rows' => 'LinkElement',
    'Columns' => 'LinkElement',
    'CellList' => 'ARRAY[LinkElement]',
    'link' => 'Link'
};

my $attribute_map = {
    'MaxRow' => 'MaxRow',
    'MaxColumn' => 'MaxColumn',
    'CellCount' => 'CellCount',
    'Rows' => 'Rows',
    'Columns' => 'Columns',
    'CellList' => 'CellList',
    'link' => 'link'
};

# new object
sub new { 
    my ($class, %args) = @_; 
    my $self = { 
        #
        'MaxRow' => $args{'MaxRow'}, 
        #
        'MaxColumn' => $args{'MaxColumn'}, 
        #
        'CellCount' => $args{'CellCount'}, 
        #
        'Rows' => $args{'Rows'}, 
        #
        'Columns' => $args{'Columns'}, 
        #
        'CellList' => $args{'CellList'}, 
        #
        'link' => $args{'link'}
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
